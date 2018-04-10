package memento.gof;

/**
 * 原始类，里面有需要保存的属性value及创建一个备忘录类，用来保存value值
 */
public class Original {

    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Original(String value) {
        this.value = value;
    }

    // 创建备忘录
    public Memento createMemento() {
        return new Memento(value);
    }

    // 从备忘录恢复
    public void restoreMemento(Memento memento) {
        this.value = memento.getValue();
    }
}

