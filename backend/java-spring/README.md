# Aware SDK for Java (Spring)

This module enables Aware full stack recording capability for Java Spring web services.

## Installation Guide

Prerequisite: Enable OpenTelemetry in your Java Spring web service and configure to export tracing data to Aware servers. Follow steps [here](https://awarelabs.io/blog/getting-started-java).

1.Add following to your gradle file to import Aware SDK library:

```
repositories {
   maven { url = uri("https://jitpack.io") }
}

...

implementation("com.github.awarelabshq:aware-sdk:0.0.1")

```

2. Add ```@EnableAspectJAutoProxy``` In your ```@SpringApplication``` annotated class (This wires up the sdk components to the spring contexts. However, the components are by default disabled, which can be enabled via property definitions).

## Configuration Guide

Aware SDK looks for the following properties (defined via ```application.properties``` or equivalent) to enable / disable features:

```aware.sdk.enabled```: true | false (default: false)

This enables the sdk and captures tracking headers (session tracking / test invocation tracking etc.)

```aware.request_body_capture.enabled```: true | false (default: false)

This enables request body capture on incoming requests to the service. The exact requests captured, the fields that are captured and ignored etc. are configured via request_body_captrue_config.yml file.

```aware.response_body_capture.enabled```: true | false (default: false)

This enables response body capture on the service. The exact responses captured, the fields that are captured and ignored etc. are configured via request_body_captrue_config.yml file.

```aware.sdk.config.file.path```: (default: ```classpath:aware_sdk_config.yml```)

This yml file details how the requests / responses should be captured (field masking, header ignoring etc.) Refer to Aware Request Capture Config section for more details.

