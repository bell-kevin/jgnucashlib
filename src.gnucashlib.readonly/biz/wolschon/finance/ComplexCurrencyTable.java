/**
 * ComplexCurrencyTable.java
 * created: 28.08.2005 15:04:10
 * (c) 2005 by <a href="http://Wolschon.biz">Wolschon Softwaredesign und Beratung</a>
 */
package biz.wolschon.finance;

//other imports
import java.util.*;

//automatically created logger for debug and error -output
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;

import biz.wolschon.numbers.FixedPointNumber;

//automatically created propertyChangeListener-Support
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;


/**
 * (c) 2005 by <a href="http://Wolschon.biz>Wolschon Softwaredesign und Beratung</a>.<br/>
 * Project: gnucashReader<br/>
 * ComplexCurrencyTable.java<br/>
 * created: 28.08.2005 15:04:10 <br/>
 *<br/>
 *
 * Currency-Table that can work with multiple namespaces.<br/>
 * By default "ISO4217"-"EUR" is added with the value 1. (to be used as a base.currency)
 *
 * @author <a href="mailto:Marcus@Wolschon.biz">Marcus Wolschon</a>
 */
public class ComplexCurrencyTable extends SimpleCurrencyTable implements Serializable {

	
	public interface ComplexCurrencyTableChangeListener {
		void conversionFactorChanged(final String namespace, final String currency, final FixedPointNumber factor);
	}
	
	private transient volatile List<ComplexCurrencyTableChangeListener> listeners = null;
	
	public void addComplexCurrencyTableChangeListener(final ComplexCurrencyTableChangeListener listener) {
		if (this.listeners == null)
			this.listeners = new LinkedList<ComplexCurrencyTableChangeListener>();
		this.listeners.add(listener);
	}
	public void removeComplexCurrencyTableChangeListener(final ComplexCurrencyTableChangeListener listener) {
		if (this.listeners == null)
			this.listeners = new LinkedList<ComplexCurrencyTableChangeListener>();
		this.listeners.remove(listener);
	}
	
	protected void fireCurrencyTableChanged(final String namespace, final String currency, final FixedPointNumber factor) {
		if (this.listeners != null)
		for (ComplexCurrencyTableChangeListener listener : this.listeners) {
			listener.conversionFactorChanged(namespace, currency, factor);
		}		
	}

    /**
     * Namespace is e.g. "ISO4217" or "FUND"
     */
    private Map<String, SimpleCurrencyTable> namespace2CurrencyTable;


/**
 * Automatically created logger for debug and error-output.
 */
private static final Log LOGGER = LogFactory.getLog(ComplexCurrencyTable.class);

//------------------------ support for propertyChangeListeners ------------------
//
///**
// * support for firing PropertyChangeEvents
// * (gets initialized only if we really have listeners)
// */
//protected volatile PropertyChangeSupport propertyChange = null;
//
///**
// * Add a PropertyChangeListener to the listener list.
// * The listener is registered for all properties.
// *
// * @param listener  The PropertyChangeListener to be added
// */
//public final void addPropertyChangeListener(
//                                            final PropertyChangeListener listener) {
//    if (propertyChange == null) {
//        propertyChange = new PropertyChangeSupport(this);
//    }
//    propertyChange.addPropertyChangeListener(listener);
//}
//
///**
// * Add a PropertyChangeListener for a specific property.  The listener
// * will be invoked only when a call on firePropertyChange names that
// * specific property.
// *
// * @param propertyName  The name of the property to listen on.
// * @param listener  The PropertyChangeListener to be added
// */
//public final void addPropertyChangeListener(
//                                            final String propertyName,
//                                            final PropertyChangeListener listener) {
//    if (propertyChange == null) {
//        propertyChange = new PropertyChangeSupport(this);
//    }
//    propertyChange.addPropertyChangeListener(propertyName, listener);
//}
//
///**
// * Remove a PropertyChangeListener for a specific property.
// *
// * @param propertyName  The name of the property that was listened on.
// * @param listener  The PropertyChangeListener to be removed
// */
//public final void removePropertyChangeListener(
//                                               final String propertyName,
//                                               final PropertyChangeListener listener) {
//    if (propertyChange != null) {
//        propertyChange.removePropertyChangeListener(propertyName, listener);
//    }
//}
//
///**
// * Remove a PropertyChangeListener from the listener list.
// * This removes a PropertyChangeListener that was registered
// * for all properties.
// *
// * @param listener  The PropertyChangeListener to be removed
// */
//public synchronized void removePropertyChangeListener(
//                                                      final PropertyChangeListener listener) {
//    if (propertyChange != null) {
//        propertyChange.removePropertyChangeListener(listener);
//    }
//}
//
//-------------------------------------------------------

/**
 * Just an overridden ToString to return this classe's name
 * and hashCode.
 * @return className and hashCode
 */
public String toString() {
    return "ComplexCurrencyTable@" + hashCode();
}

/**
 * Add a new namespace with no conversion-factors.<br/>
 * Will not overwrite an existing namespace.
 * @param namespace the new namespace to add.
 */
public void addNameSpace(final String namespace) {
    if (getNamespace(namespace) != null)
        return;

    SimpleCurrencyTable currencyTable = new SimpleCurrencyTable();
    currencyTable.clear();
    addNameSpace(namespace, currencyTable);
}

/**
 * Add a new namespace with an initial set of conversion-factors.
 * @param namespace the new namespace to add.
 * @param values an initial set of conversion-factors.
 */
public void addNameSpace(final String namespace,
                         final SimpleCurrencyTable values) {
    if (namespace2CurrencyTable == null)
        namespace2CurrencyTable = new HashMap();
    namespace2CurrencyTable.put(namespace, values);
}



/**
 * @see biz.wolschon.finance.SimpleCurrencyTable#clear()
 */
public void clear() {
    super.clear();
    if (namespace2CurrencyTable == null)
        namespace2CurrencyTable = new HashMap();
    namespace2CurrencyTable.clear();
}

/**
 * @see biz.wolschon.finance.SimpleCurrencyTable#convertFromBaseCurrency(biz.wolschon.numbers.FixedPointNumber, java.lang.String)
 */
public boolean convertFromBaseCurrency(FixedPointNumber pValue, String pIso4217CurrencyCode) {
    if (pIso4217CurrencyCode == null)
        throw new IllegalArgumentException("null currency-id given!");

    return convertFromBaseCurrency("ISO4217", pValue, pIso4217CurrencyCode);
}

/**
 * @param namespace e.g. "ISO4217"
 * @see SimpleCurrencyTable#convertFromBaseCurrency(FixedPointNumber, String)
 */
public boolean convertToBaseCurrency(final String namespace,
                                        final FixedPointNumber pValue,
                                        final String pIso4217CurrencyCode) {

    if (namespace == null)
        throw new IllegalArgumentException("null namepace given!");
    if (pIso4217CurrencyCode == null)
        throw new IllegalArgumentException("null currency-id given!");

    SimpleCurrencyTable table = getNamespace(namespace);

    if (table == null)
        return false;

    return table.convertToBaseCurrency(pValue, pIso4217CurrencyCode);
}

/**
 * @param namespace e.g. "ISO4217"
 * @see SimpleCurrencyTable#convertFromBaseCurrency(FixedPointNumber, String)
 */
public boolean convertFromBaseCurrency(final String namespace,
                                        final FixedPointNumber pValue,
                                        final String pIso4217CurrencyCode) {

    if (namespace == null)
        throw new IllegalArgumentException("null namepace given!");
    if (pIso4217CurrencyCode == null)
        throw new IllegalArgumentException("null currency-id given!");

    SimpleCurrencyTable table = getNamespace(namespace);

    if (table == null)
        return false;

    return table.convertFromBaseCurrency(pValue, pIso4217CurrencyCode);
}

/**
 * @see biz.wolschon.finance.SimpleCurrencyTable#convertToBaseCurrency(biz.wolschon.numbers.FixedPointNumber, java.lang.String)
 */
public boolean convertToBaseCurrency(final FixedPointNumber pValue,
                                     final String pIso4217CurrencyCode) {
    if (pIso4217CurrencyCode == null)
        throw new IllegalArgumentException("null currency-id given!");
    return convertToBaseCurrency("ISO4217", pValue, pIso4217CurrencyCode);
}

/**
 * @see biz.wolschon.finance.SimpleCurrencyTable#getConversionFactor(java.lang.String)
 */
public FixedPointNumber getConversionFactor(final String pIso4217CurrencyCode) {
    if (pIso4217CurrencyCode == null)
        throw new IllegalArgumentException("null currency-id given!");
    return getConversionFactor("ISO4217", pIso4217CurrencyCode);
}

/**
 * @see biz.wolschon.finance.SimpleCurrencyTable#setConversionFactor(java.lang.String, biz.wolschon.numbers.FixedPointNumber)
 */
public void setConversionFactor(final String pIso4217CurrencyCode,
                                final FixedPointNumber pFactor) {

    if (pIso4217CurrencyCode == null)
        throw new IllegalArgumentException("null currency-id given!");
    if (pFactor == null)
        throw new IllegalArgumentException("null conversion-factor given!");

    setConversionFactor("ISO4217", pIso4217CurrencyCode, pFactor);
    
    fireCurrencyTableChanged("ISO4217", pIso4217CurrencyCode, pFactor);
}

/**
 * If the namespace does not exist yet, it is created.
 * @see biz.wolschon.finance.SimpleCurrencyTable#setConversionFactor(java.lang.String, biz.wolschon.numbers.FixedPointNumber)
 */
public void setConversionFactor(final String namespace,
                                final String pIso4217CurrencyCode,
                                final FixedPointNumber pFactor) {

    if (namespace == null)
        throw new IllegalArgumentException("null namepace given!");
    if (pIso4217CurrencyCode == null)
        throw new IllegalArgumentException("null currency-id given!");
    if (pFactor == null)
        throw new IllegalArgumentException("null conversion-factor given!");

    SimpleCurrencyTable table = getNamespace(namespace);
    if (table == null) {
        addNameSpace(namespace);
        table = getNamespace(namespace);
    }

    table.setConversionFactor(pIso4217CurrencyCode, pFactor);
    
    fireCurrencyTableChanged(namespace, pIso4217CurrencyCode, pFactor);
}

/**
 * @see biz.wolschon.finance.SimpleCurrencyTable#setConversionFactor(java.lang.String, biz.wolschon.numbers.FixedPointNumber)
 */
public FixedPointNumber getConversionFactor(final String namespace,
                                final String pIso4217CurrencyCode) {

    if (pIso4217CurrencyCode == null)
        throw new IllegalArgumentException("null currency-id given!");

    SimpleCurrencyTable table = getNamespace(namespace);
    if (table == null) {
        return null;
    }

    return table.getConversionFactor(pIso4217CurrencyCode);
}


public Collection<String> getNameSpaces() {
	if (namespace2CurrencyTable == null)
        namespace2CurrencyTable = new HashMap();
	
	return namespace2CurrencyTable.keySet();
}

/**
 * @param namespace
 * @return
 */
protected SimpleCurrencyTable getNamespace(String namespace) {
    if (namespace == null)
        throw new IllegalArgumentException("null namepace given!");

    if (namespace2CurrencyTable == null)
        namespace2CurrencyTable = new HashMap();

    return (SimpleCurrencyTable) namespace2CurrencyTable.get(namespace);
}

/**
 *
 */
public ComplexCurrencyTable() {
    super();

    addNameSpace("ISO4217", new SimpleCurrencyTable());
}

/**
 * @param pNamespace
 */
public Collection<String> getCurrencies(final String pNamespace) {
	SimpleCurrencyTable namespace = getNamespace(pNamespace);
	if (namespace == null) {
		return new HashSet<String>();
	}
	return namespace.getCurrencies();
}
}