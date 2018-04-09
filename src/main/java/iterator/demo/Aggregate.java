package iterator.demo;

/**
 * 聚集接口
 *
 * @param <T>
 */
public interface Aggregate<T> {

    Iterator<T> iterator();
}
