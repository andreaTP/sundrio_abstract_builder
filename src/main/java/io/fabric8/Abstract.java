package io.fabric8;

public abstract class Abstract {
    private String foo;
    protected String bar;

    public Abstract() {
        this.foo = "foo";
        this.bar = "bar";
    }

    public String getFoo() {
        return foo;
    }

    public void setFoo(String foo) {
        this.foo = foo;
    }

    public String getBar() {
        return bar;
    }

    public void setBar(String bar) {
        this.bar = bar;
    }
}
