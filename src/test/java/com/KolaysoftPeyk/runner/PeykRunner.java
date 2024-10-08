package com.KolaysoftPeyk.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
  features = "src/test/resources/features",
  glue = "com/KolaysoftPeyk/step_definitions",
  dryRun = false,
  tags = "@Calisan"

)
public class PeykRunner {}

