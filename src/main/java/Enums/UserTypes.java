package Enums;

public enum UserTypes {
    TYPE_ALUNO("aluno"),
    TYPE_ADMIN("admin"),
    TYPE_INST("inst");
    
    private final String type;
    
    UserTypes(String type){
        this.type = type;
    }
    
    public String getValue() {
        return type;
    }

    public static UserTypes fromString(String value) {
        for (UserTypes type : UserTypes.values()) {
            if (type.getValue().equalsIgnoreCase(value)) {
                return type;
            }
        }
        throw new IllegalArgumentException("Unknown value: " + value);
    }
}
