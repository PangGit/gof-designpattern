package iterator.demo;

/**
 * 迭代器接口
 *
 * @param <T>
 */
public interface Iterator<T> {

    /*第一个*/
    public T first();

    /*下一个*/
    public T next();

    /*是否结束*/
    public boolean isDone();

    /*当前对象*/
    public T currentItem();

}
