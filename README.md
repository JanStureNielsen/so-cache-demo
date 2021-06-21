# Configuring Hibernate Query and Second Level Caches with EhCache

[Stackoverflow question](https://stackoverflow.com/questions/67993442/hhh90001006-missing-cachedefault-update-timestamps-region-was-created-on-the)

A trivial [Spring Boot 2.5 application](https://github.com/JanStureNielsen/so-cache-demo) with Spring Data JPA with EhCache 3 and Hibernate 5 with Query and Second Level Caches enabled:

```
spring.jpa.properties.hibernate.cache.use_query_cache=true
spring.jpa.properties.hibernate.cache.use_second_level_cache=true
```

generates a warning from Hibernate and an information message from EhCache for each cache on startup:

```
WARN org.hibernate.orm.cache          HHH90001006: Missing cache[default-update-timestamps-region] was created on-the-fly. The created cache will use a provider-specific default configuration: make sure you defined one. You can disable this warning by setting 'hibernate.javax.cache.missing_cache_strategy' to 'create'.
INFO org.ehcache.core.EhcacheManager  Cache 'default-update-timestamps-region' created in EhcacheManager.
```

and

```
WARN org.hibernate.orm.cache          HHH90001006: Missing cache[default-query-results-region] was created on-the-fly. The created cache will use a provider-specific default configuration: make sure you defined one. You can disable this warning by setting 'hibernate.javax.cache.missing_cache_strategy' to 'create'.
INFO org.ehcache.core.EhcacheManager  Cache 'default-query-results-region' created in EhcacheManager.
```

What's the proper EhCache configuration for these Hibernate caches?
