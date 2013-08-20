package tr.org.linux.opencourseorganizer.server.domain;

import java.util.Date;

public class Subject implements Identifiable, Versionable {

	private Long id;

	private Long version;

	private String name;

	private Date signUpDeadline;

	private Long eventId;

	public Subject() {}

	public Subject(Long id, String name, Date signUpDeadline, Long eventId) {
		this.id = id;
		this.name = name;
		this.signUpDeadline = signUpDeadline;
		this.eventId = eventId;
	}

	@Override
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public Long getVersion() {
		if (version == null)
			version = 0L;
		return version;
	}

	public void setVersion(Long version) {
		this.version = version;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getSignUpDeadline() {
		return signUpDeadline;
	}

	public void setSignUpDeadline(Date signUpDeadline) {
		this.signUpDeadline = signUpDeadline;
	}

	public Long getEventId() {
		return eventId;
	}

	public void setEventId(Long eventId) {
		this.eventId = eventId;
	}

}
