package tr.org.linux.opencourseorganizer.server.domain;

//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.Table;
//import javax.persistence.Version;
//import javax.validation.constraints.NotNull;

//@Entity
//@Table(name = "Event")
public class Event implements Identifiable, Versionable {

//	@Id
//	@Column(name = "Id")
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

//	@Version
//	@Column(name = "Version")
	private Long version;

//	@Column(name = "Name")
//	@NotNull
	private String name;

	public Event() {}

	@Override
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public Long getVersion() {
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

}
