package com.hindicoding.spring5webapp.repositories;/* created by akshaypaswan on 04/01/21 */

import com.hindicoding.spring5webapp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
