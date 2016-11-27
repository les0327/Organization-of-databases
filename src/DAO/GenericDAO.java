package DAO;

import java.sql.SQLException;

/**
 * Created on 24.11.2016
 *
 * @author Les
 * @version 1.0
 *
 * @param <E> - type of entity
 * @param <K> - type of primary key
 */
public interface GenericDAO<E, K> {

    /**
     * Allows to get all entities from data base
     * @return array with all entities
     * @throws SQLException on data base errors
     */
    E[] getAll() throws SQLException;

    /**
     * Allows to get entity by key
     * @param key - primary key of entity
     * @return entity with current key
     * @throws SQLException on data base errors
     */
    E getByKey(K key) throws SQLException;

    /**
     * Save entity to data base
     * @param entity - entity that we want to save
     * @throws SQLException on data base errors
     */
    void create(E entity) throws SQLException;

    /**
     * Update entity from data base
     * @param entity - entity that we want to update
     * @throws SQLException on data base errors
     */
    void update(E entity) throws SQLException;

    /**
     * Delete entity from data base
     * @param key - primary key of entity
     * @throws SQLException on data base errors
     */
    void delete(K key) throws SQLException;

}
