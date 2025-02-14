package com.symphony.bdk.workflow.configuration;

import com.symphony.bdk.workflow.engine.ResourceProvider;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("!test")
public class WorkflowBotConfiguration {

  @Bean("workflowResourcesProvider")
  public ResourceProvider workflowResourcesProvider(@Value("${workflows.folder}") String resourcesFolder) {
    // ./workflows folder is used both to load workflows and local resources
    return new WorkflowResourcesProvider(resourcesFolder);
  }
}
