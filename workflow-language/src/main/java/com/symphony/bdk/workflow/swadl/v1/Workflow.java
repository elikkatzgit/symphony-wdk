package com.symphony.bdk.workflow.swadl.v1;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Workflow {
  private String id;
  private Map<String, Object> variables = Collections.emptyMap();
  private List<Activity> activities;

  public Optional<Activity> getFirstActivity() {
    return activities.stream().findFirst();
  }
}
