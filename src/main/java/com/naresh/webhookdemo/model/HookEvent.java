package com.naresh.webhookdemo.model;

public class HookEvent {

	@Override
	public String toString() {
		return "HookEvent [type=" + type + ", id=" + id + ", livemode=" + livemode + ", created=" + created
				+ ", hook_event_id=" + hook_event_id + ", object=" + object + "]";
	}

	private String type;
	private Long id;
	private boolean livemode;
	
	private String created;
	private Long hook_event_id;
	
	private ActivityEvent object;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public boolean isLivemode() {
		return livemode;
	}

	public void setLivemode(boolean livemode) {
		this.livemode = livemode;
	}

	public String getCreated() {
		return created;
	}

	public void setCreated(String created) {
		this.created = created;
	}

	public Long getHook_event_id() {
		return hook_event_id;
	}

	public void setHook_event_id(Long hook_event_id) {
		this.hook_event_id = hook_event_id;
	}

	public ActivityEvent getObject() {
		return object;
	}

	public void setObject(ActivityEvent object) {
		this.object = object;
	}
	
	
}
