package org.geotools.data.efeature.query;

import java.util.Date;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.query.conditions.eobjects.structuralfeatures.EObjectAttributeValueCondition;
import org.opengis.filter.expression.Literal;

public class EAttributeValueIsGreaterThan extends EObjectAttributeValueCondition {

    public EAttributeValueIsGreaterThan(EAttribute eAttribute, Literal value)
            throws EFeatureEncoderException {
        super(eAttribute, ConditionEncoder.greaterThan(value));
    }

    public EAttributeValueIsGreaterThan(EAttribute eAttribute, Number value)
            throws EFeatureEncoderException {
        super(eAttribute, ConditionEncoder.greaterThan(value));
    }

    public EAttributeValueIsGreaterThan(EAttribute eAttribute, Date value)
            throws EFeatureEncoderException {
        super(eAttribute, ConditionEncoder.greaterThan(value));
    }

    public EAttributeValueIsGreaterThan(EAttribute eAttribute, String value)
            throws EFeatureEncoderException {
        super(eAttribute, ConditionEncoder.greaterThan(value));
    }

}
