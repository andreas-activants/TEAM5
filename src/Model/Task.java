package Model;

import java.util.Date;

public class Task {
	private String title;
	private Date start;
	private Date end;
	private String description;
	private User agent;
	private boolean isComplete;
	private boolean isDelete;

	public Task(String title, Date start, Date end, String description, User agent) {
		this.title = title;
		this.start = start;
		this.end = end;
		this.description = description;
		this.agent = agent;
		this.isComplete = false;
		this.isDelete = false;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getStart() {
		return start;
	}

	public void setStart(Date start) {
		this.start = start;
	}

	public Date getEnd() {
		return end;
	}

	public void setEnd(Date end) {
		this.end = end;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public User getAgent() {
		return agent;
	}

	public void setAgent(User agent) {
		this.agent = agent;
	}

	public boolean isComplete() {
		return isComplete;
	}

	public void setComplete(boolean complete) {
		isComplete = complete;
	}

	public boolean isDelete() {
		return isDelete;
	}

	public void setDelete(boolean delete) {
		isDelete = delete;
	}

	public void edit(String title, Date start, Date end, String description) {
		this.title = title;
		this.start = start;
		this.end = end;
		this.description = description;
	}

	public void delete() {
		this.isDelete = true;
	}

	public void assign(User agent) {
		this.agent = agent;
	}

	public boolean equals(Task task) {
		return this.title.equalsIgnoreCase(task.title)
				&& this.description.equalsIgnoreCase(task.description)
//				&& this.agent.equals(task.agent)
				&& this.start.equals(task.start)
				&& this.end.equals(task.end);
	}
}
