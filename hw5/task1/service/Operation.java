package hw5.task1.service;

import hw5.task1.model.Example;

/**
 * Интерфейс математических операций
 *
 * @param <T> extends Number
 */
public interface Operation<T> {
    T sum(Example<T> example);

    T difference(Example<T> example);

    T multiply(Example<T> example);

    T divide(Example<T> example);
}
