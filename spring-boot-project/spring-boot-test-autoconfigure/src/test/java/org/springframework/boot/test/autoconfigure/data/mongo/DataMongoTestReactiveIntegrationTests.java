/*
 * Copyright 2012-2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.boot.test.autoconfigure.data.mongo;

import java.time.Duration;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.ReactiveMongoTemplate;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Sample tests for {@link DataMongoTest @DataMongoTest} using reactive repositories.
 *
 * @author Stephane Nicoll
 */
@DataMongoTest
class DataMongoTestReactiveIntegrationTests {

	@Autowired
	private ReactiveMongoTemplate mongoTemplate;

	@Autowired
	private ExampleReactiveRepository exampleRepository;

	@Test
	void testRepository() {
		ExampleDocument exampleDocument = new ExampleDocument();
		exampleDocument.setText("Look, new @DataMongoTest!");
		exampleDocument = this.exampleRepository.save(exampleDocument).block(Duration.ofSeconds(30));
		assertThat(exampleDocument.getId()).isNotNull();
		assertThat(this.mongoTemplate.collectionExists("exampleDocuments").block(Duration.ofSeconds(30))).isTrue();
	}

}
