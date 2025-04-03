package nivel1.ex1;

public class NoGenericMethods {
    private String object1;
    private String object2;
    private String object3;

    public NoGenericMethods(String object1, String object2, String object3) {
        this.object1 = object1;
        this.object2 = object2;
        this.object3 = object3;
    }

    public Object getObject1() {
        return object1;
    }

    public void setObject1(String object1) {
        this.object1 = object1;
    }

    public Object getObject2() {
        return object2;
    }

    public void setObject2(String object2) {
        this.object2 = object2;
    }

    public Object getObject3() {
        return object3;
    }

    public void setObject3(String object3) {
        this.object3 = object3;
    }

    @Override
    public String toString() {
        return "Level 1, exercise 1 [" +
                "object1: " + object1 +
                ", object2: " + object2 +
                ", object3: " + object3 +
                ']';
    }
}

