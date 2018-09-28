package com.jdbc.entity;

public class Stream {
	 private int streamId;
	 public Stream(int streamId, String streamName) {
		super();
		this.streamId = streamId;
		this.streamName = streamName;
	}
	public int getStreamId() {
		return streamId;
	}
	public void setStreamId(int streamId) {
		this.streamId = streamId;
	}
	public String getStreamName() {
		return streamName;
	}
	public void setStreamName(String streamName) {
		this.streamName = streamName;
	}
	private String streamName;
	  

}
