/*
 * Copyright 2006-2007 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.batch.core.listener;

import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.StepExecutionListener;
import org.springframework.batch.repeat.ExitStatus;

/**
 * @author Dave Syer
 *
 */
public class StepExecutionListenerSupport implements StepExecutionListener {

	/* (non-Javadoc)
	 * @see org.springframework.batch.core.domain.StepListener#afterStep(StepExecution stepExecution)
	 */
	public ExitStatus afterStep(StepExecution stepExecution) {
		return null;
	}

	/* (non-Javadoc)
	 * @see org.springframework.batch.core.domain.StepListener#open(org.springframework.batch.item.ExecutionContext)
	 */
	public void beforeStep(StepExecution stepExecution) {
	}

	/* (non-Javadoc)
	 * @see org.springframework.batch.core.domain.StepListener#onError(java.lang.Throwable)
	 */
	public ExitStatus onErrorInStep(StepExecution stepExecution, Throwable e) {
		return null;
	}
}
