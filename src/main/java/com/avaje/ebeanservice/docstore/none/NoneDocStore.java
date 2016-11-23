package com.avaje.ebeanservice.docstore.none;

import com.avaje.ebean.DocStoreQueueEntry;
import com.avaje.ebean.DocumentStore;
import com.avaje.ebean.PagedList;
import com.avaje.ebean.Query;
import com.avaje.ebean.QueryEachWhileConsumer;
import com.avaje.ebeanservice.docstore.api.DocQueryRequest;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

/**
 * DocumentStore that barfs it is used.
 */
public class NoneDocStore implements DocumentStore {

  public static IllegalStateException implementationNotInClassPath() {
    throw new IllegalStateException("DocStore implementation not included in the classPath. You need to add the maven dependency for avaje-ebeanorm-elastic");
  }

  @Override
  public void indexSettings(String indexName, Map<String, Object> settings) {
    throw implementationNotInClassPath();
  }

  @Override
  public void dropIndex(String newIndex) {
    throw implementationNotInClassPath();
  }

  @Override
  public void createIndex(String indexName, String alias) {
    throw implementationNotInClassPath();
  }

  @Override
  public void indexAll(Class<?> countryClass) {
    throw implementationNotInClassPath();
  }

  @Override
  public long copyIndex(Class<?> beanType, String newIndex) {
    throw implementationNotInClassPath();
  }

  @Override
  public long copyIndex(Class<?> beanType, String newIndex, long epochMillis) {
    throw implementationNotInClassPath();
  }

  @Override
  public long copyIndex(Query<?> query, String newIndex, int bulkBatchSize) {
    throw implementationNotInClassPath();
  }

  @Override
  public <T> void indexByQuery(Query<T> query) {
    throw implementationNotInClassPath();
  }

  @Override
  public <T> void indexByQuery(Query<T> query, int bulkBatchSize) {
    throw implementationNotInClassPath();
  }

  @Override
  public <T> T find(DocQueryRequest<T> request) {
    throw implementationNotInClassPath();
  }

  @Override
  public <T> PagedList<T> findPagedList(DocQueryRequest<T> request) {
    throw implementationNotInClassPath();
  }

  @Override
  public <T> List<T> findList(DocQueryRequest<T> request) {
    throw implementationNotInClassPath();
  }

  @Override
  public <T> void findEach(DocQueryRequest<T> query, Consumer<T> consumer) {
    throw implementationNotInClassPath();
  }

  @Override
  public <T> void findEachWhile(DocQueryRequest<T> query, QueryEachWhileConsumer<T> consumer) {
    throw implementationNotInClassPath();
  }

  @Override
  public long process(List<DocStoreQueueEntry> queueEntries) throws IOException {
    throw implementationNotInClassPath();
  }
}
