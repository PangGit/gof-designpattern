package visitor.gof;

/**
 * 访问者模式：把数据结构和作用于结构上的操作解耦合，使得操作集合可相对自由地演化。
 * <p>
 * 访问者模式适用于数据结构相对稳定算法又易变化的系统。
 */
public interface Visitor {

    void visit(Subject sub);
}
