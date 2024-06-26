// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: model.proto

package org.testchimp.model;

public interface InsertClientRecordedPayloadRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:org.testchimp.model.InsertClientRecordedPayloadRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional .org.testchimp.model.Payload request_payload = 1;</code>
   * @return Whether the requestPayload field is set.
   */
  boolean hasRequestPayload();
  /**
   * <code>optional .org.testchimp.model.Payload request_payload = 1;</code>
   * @return The requestPayload.
   */
  org.testchimp.model.Payload getRequestPayload();
  /**
   * <code>optional .org.testchimp.model.Payload request_payload = 1;</code>
   */
  org.testchimp.model.PayloadOrBuilder getRequestPayloadOrBuilder();

  /**
   * <code>optional .org.testchimp.model.Payload response_payload = 2;</code>
   * @return Whether the responsePayload field is set.
   */
  boolean hasResponsePayload();
  /**
   * <code>optional .org.testchimp.model.Payload response_payload = 2;</code>
   * @return The responsePayload.
   */
  org.testchimp.model.Payload getResponsePayload();
  /**
   * <code>optional .org.testchimp.model.Payload response_payload = 2;</code>
   */
  org.testchimp.model.PayloadOrBuilder getResponsePayloadOrBuilder();

  /**
   * <code>optional string url = 3;</code>
   * @return Whether the url field is set.
   */
  boolean hasUrl();
  /**
   * <code>optional string url = 3;</code>
   * @return The url.
   */
  java.lang.String getUrl();
  /**
   * <code>optional string url = 3;</code>
   * @return The bytes for url.
   */
  com.google.protobuf.ByteString
      getUrlBytes();

  /**
   * <code>optional string session_recording_tracking_id = 4;</code>
   * @return Whether the sessionRecordingTrackingId field is set.
   */
  boolean hasSessionRecordingTrackingId();
  /**
   * <code>optional string session_recording_tracking_id = 4;</code>
   * @return The sessionRecordingTrackingId.
   */
  java.lang.String getSessionRecordingTrackingId();
  /**
   * <code>optional string session_recording_tracking_id = 4;</code>
   * @return The bytes for sessionRecordingTrackingId.
   */
  com.google.protobuf.ByteString
      getSessionRecordingTrackingIdBytes();

  /**
   * <code>optional string current_user_id = 5;</code>
   * @return Whether the currentUserId field is set.
   */
  boolean hasCurrentUserId();
  /**
   * <code>optional string current_user_id = 5;</code>
   * @return The currentUserId.
   */
  java.lang.String getCurrentUserId();
  /**
   * <code>optional string current_user_id = 5;</code>
   * @return The bytes for currentUserId.
   */
  com.google.protobuf.ByteString
      getCurrentUserIdBytes();
}
