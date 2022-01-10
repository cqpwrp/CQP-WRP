package com.honda.am.cqp.util;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

@Repository
public interface BaseRepoInterface<E,K>{
	
	public List<E> findAll();

	
	public List<E> findAll(Sort sort);

	
	public List<E> findAllById(Iterable<K> ids);

	
	public <S extends E> List<S> saveAll(Iterable<S> entities);

	
	public void flush();

	
	public <S extends E> S saveAndFlush(S entity);

	
	public Page<E> findAll(Pageable pageable);

	
	public <S extends E> S save(S entity);

	
	public Optional<E> findById(K id);

	
	public boolean existsById(K id);

	
	public long count();

	
	public void deleteById(K id);

	
	public void delete(E entity);

	
	public void deleteAllById(Iterable<? extends K> ids);

	
	public void deleteAll(Iterable<? extends E> entities);

	
	public void deleteAll();

	
	public <S extends E> Optional<S> findOne(Example<S> example);

	
	public <S extends E> Page<S> findAll(Example<S> example, Pageable pageable);

	
	public <S extends E> long count(Example<S> example);

	
	public <S extends E> boolean exists(Example<S> example);

	
	public <S extends E> List<S> saveAllAndFlush(Iterable<S> entities);

	
	public void deleteAllInBatch(Iterable<E> entities);

	
	public void deleteAllByIdInBatch(Iterable<K> ids);

	
	public void deleteAllInBatch();

	
	public E getOne(K id);

	
	public E getById(K id);

	
	public <S extends E> List<S> findAll(Example<S> example);

	
	public <S extends E> List<S> findAll(Example<S> example, Sort sort);

}
