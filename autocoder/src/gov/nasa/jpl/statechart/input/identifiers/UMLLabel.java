package gov.nasa.jpl.statechart.input.identifiers;

/**
 * This Enum represents known UML identifiers used in XML documents.
 * These enums are used as keys to map to possibly version-specific UML
 * identifiers. 
 */
public enum UMLLabel {
    UML_NS { public String defaultLiteral () { return "http://schema.omg.org/spec/UML/?.?"; } },

    TAG_MODEL { public String defaultLiteral () { return "Model"; } },
    TAG_MEMBER_ATTRIBUTE { public String defaultLiteral () { return "ownedAttribute"; } },
    TAG_MEMBER_ELEMENT { public String defaultLiteral () { return "ownedMember"; } },
    TAG_MEMBER_BEHAVIOR { public String defaultLiteral () { return "ownedBehavior"; } },
    TAG_MEMBER_RULE { public String defaultLiteral () { return "ownedRule"; } },
    TAG_MEMBER_LITERAL { public String defaultLiteral () { return "ownedLiteral"; } },
    TAG_CONSTRAINED_ELEMENT { public String defaultLiteral () { return "constrainedElement"; } },
    TAG_NESTED_CLASSIFIER { public String defaultLiteral () { return "nestedClassifier"; } },
    TAG_REGION { public String defaultLiteral () { return "region"; } },
    TAG_SUBVERTEX { public String defaultLiteral () { return "subvertex"; } },
    TAG_TRANSITION { public String defaultLiteral () { return "transition"; } },
    TAG_SIGNAL { public String defaultLiteral () { return "signal"; } },
    TAG_TRIGGER { public String defaultLiteral () { return "trigger"; } },
    TAG_INCOMING { public String defaultLiteral () { return "incoming"; } },
    TAG_OUTGOING { public String defaultLiteral () { return "outgoing"; } },
    TAG_ENTRY { public String defaultLiteral () { return "entry"; } },
    TAG_EXIT { public String defaultLiteral () { return "exit"; } },
    TAG_GUARD { public String defaultLiteral () { return "guard"; } },
    TAG_EFFECT { public String defaultLiteral () { return "effect"; } },
    TAG_ACTIVITY { public String defaultLiteral () { return "activity"; } },
    TAG_INTERACTION { public String defaultLiteral () { return "interaction"; } },
    TAG_DOACTIVITY { public String defaultLiteral () { return "doActivity"; } },
    TAG_CONNECTION { public String defaultLiteral () { return "connection"; } },
    TAG_CONNECTION_POINT { public String defaultLiteral () { return "connectionPoint"; } },
    TAG_SPECIFICATION { public String defaultLiteral () { return "specification"; } },
    TAG_SLOT { public String defaultLiteral () { return "slot"; } },
    TAG_WHEN { public String defaultLiteral () { return "when"; } },
    TAG_EXPR { public String defaultLiteral () { return "expr"; } },
    TAG_BODY { public String defaultLiteral () { return "body"; } },
    TAG_LANGUAGE { public String defaultLiteral () { return "language"; } },
    TAG_OPERAND { public String defaultLiteral () { return "operand"; } },
    TAG_TYPE { public String defaultLiteral () { return "type"; } },
    TAG_DEFAULT_VALUE { public String defaultLiteral () { return "defaultValue"; } },
    TAG_VALUE { public String defaultLiteral () { return "value"; } },

    TYPE_PACKAGE { public String defaultLiteral () { return "Package"; } },
    TYPE_CLASS { public String defaultLiteral () { return "Class"; } },
    TYPE_STATEMACHINE { public String defaultLiteral () { return "StateMachine"; } },
    TYPE_STATE { public String defaultLiteral () { return "State"; } },
    TYPE_PSEUDOSTATE { public String defaultLiteral () { return "Pseudostate"; } },
    TYPE_FINALSTATE { public String defaultLiteral () { return "FinalState"; } },
    TYPE_REGION { public String defaultLiteral () { return "Region"; } },
    TYPE_TRANSITION { public String defaultLiteral () { return "Transition"; } },
    TYPE_TRIGGER { public String defaultLiteral () { return "Trigger"; } },
    TYPE_ACTIVITY { public String defaultLiteral () { return "Activity"; } },
    TYPE_BEH_OPAQUE { public String defaultLiteral () { return "OpaqueBehavior"; } },
    TYPE_BEH_FUNCTION { public String defaultLiteral () { return "FunctionBehavior"; } },
    TYPE_SIGNAL { public String defaultLiteral () { return "Signal"; } },
    TYPE_SIGNAL_EVENT { public String defaultLiteral () { return "SignalEvent"; } },
    TYPE_SEND_SIGNAL_EVENT { public String defaultLiteral () { return "SendSignalEvent"; } },
    TYPE_RECEIVE_SIGNAL_EVENT { public String defaultLiteral () { return "ReceiveSignalEvent"; } },
    TYPE_TIME_EVENT { public String defaultLiteral () { return "TimeEvent"; } },
    TYPE_ANY_RECEIVE_EVENT { public String defaultLiteral () { return "AnyReceiveEvent"; } },
    TYPE_CONSTRAINT { public String defaultLiteral () { return "Constraint"; } },
    TYPE_EXPRESSION { public String defaultLiteral () { return "Expression"; } },
    TYPE_EXPR_OPAQUE { public String defaultLiteral () { return "OpaqueExpression"; } },
    TYPE_LITERAL_BOOLEAN { public String defaultLiteral () { return "LiteralBoolean"; } },
    TYPE_LITERAL_INTEGER { public String defaultLiteral () { return "LiteralInteger"; } },
    TYPE_LITERAL_UNLIMITED { public String defaultLiteral () { return "LiteralUnlimitedNatural"; } },
    TYPE_LITERAL_REAL { public String defaultLiteral () { return "LiteralReal"; } },
    TYPE_LITERAL_STRING { public String defaultLiteral () { return "LiteralString"; } },
    TYPE_CONNPT_REF { public String defaultLiteral () { return "ConnectionPointReference"; } },
    TYPE_INSTANCE_SPECIFICATION { public String defaultLiteral () { return "InstanceSpecification"; } },
    TYPE_INSTANCE_VALUE { public String defaultLiteral () { return "InstanceValue"; } },
    TYPE_PROPERTY { public String defaultLiteral () { return "Property"; } },
    TYPE_SLOT { public String defaultLiteral () { return "Slot"; } },
    TYPE_ELEMENT_VALUE { public String defaultLiteral () { return "ElementValue"; } },
    TYPE_ENUMERATION { public String defaultLiteral () { return "Enumeration"; } },
    TYPE_ENUMERATION_LITERAL { public String defaultLiteral () { return "EnumerationLiteral"; } },
    TYPE_PRIMITIVE_TYPE { public String defaultLiteral () { return "PrimitiveType"; } },
    TYPE_DATA_TYPE { public String defaultLiteral () { return "DataType"; } },
    TYPE_STEREOTYPE { public String defaultLiteral () { return "Stereotype"; } },

    KEY_VISIBILITY { public String defaultLiteral () { return "visibility"; } },
    KEY_KIND { public String defaultLiteral () { return "kind"; } },
    KEY_SOURCE { public String defaultLiteral () { return "source"; } },
    KEY_TARGET { public String defaultLiteral () { return "target"; } },
    KEY_GUARD { public String defaultLiteral () { return "guard"; } },
    KEY_SIGNAL { public String defaultLiteral () { return "signal"; } },
    KEY_EVENT { public String defaultLiteral () { return "event"; } },
    KEY_BODY { public String defaultLiteral () { return "body"; } },
    KEY_LANGUAGE { public String defaultLiteral () { return "language"; } },
    KEY_SYMBOL { public String defaultLiteral () { return "symbol"; } },
    KEY_SUBMACHINE { public String defaultLiteral () { return "submachine"; } },
    KEY_IS_RELATIVE { public String defaultLiteral () { return "isRelative"; } },
    KEY_INSTANCE { public String defaultLiteral () { return "instance"; } },

    VAL_EXTERNAL { public String defaultLiteral () { return "external"; } },
    VAL_INTERNAL { public String defaultLiteral () { return "internal"; } },
    VAL_LOCAL { public String defaultLiteral () { return "local"; } },
    VAL_INITIAL { public String defaultLiteral () { return "initial"; } },
    VAL_JUNCTION { public String defaultLiteral () { return "junction"; } },
    VAL_DEEPHISTORY { public String defaultLiteral () { return "deepHistory"; } },
    VAL_ENTRYPOINT { public String defaultLiteral () { return "entryPoint"; } },
    VAL_EXITPOINT { public String defaultLiteral () { return "exitPoint"; } },
    ;

    public abstract String defaultLiteral ();
}