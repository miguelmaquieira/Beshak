package com.imotion.beshak.bom.data.jpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Version;

import com.imotion.beshak.bom.data.BSKBOLoginData;

@Entity
public class BSKBOLoginDataJPA extends BSKBOLoginData {

	private static final long serialVersionUID = -10069922585766716L;

	@Id
	@SequenceGenerator(name = "UserIdGenerator", sequenceName = "UserSeq") //It only takes effect for databases providing identifier generators.
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "UserIdGenerator")
	private 	Long 	userId;

	@Version
	private 	Long	version; 

	public BSKBOLoginDataJPA() {
		super();
	}

	public BSKBOLoginDataJPA(String email, String hash, boolean pendingAccept, int rolType) {
		super(email, hash, pendingAccept, rolType);
	}

	@Override
	public Long getUserId() {
		return userId;
	}

	@Override
	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getVersion() {
		return version;
	}

	public void setVersion(Long version) {
		this.version = version;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((userId == null) ? 0 : userId.hashCode());
		result = prime * result + ((version == null) ? 0 : version.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		BSKBOLoginDataJPA other = (BSKBOLoginDataJPA) obj;
		if (userId == null) {
			if (other.userId != null)
				return false;
		} else if (!userId.equals(other.userId))
			return false;
		if (version == null) {
			if (other.version != null)
				return false;
		} else if (!version.equals(other.version))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "BSKBOLoginDataJPA [userId=" + userId + ", version=" + version
				+ ", email=" + email + ", username=" + username + ", hash="
				+ hash + ", lastLogin=" + lastLogin + ", lastSessionId="
				+ lastSessionId + ", resetId=" + resetId + ", pendingAccept="
				+ pendingAccept + ", rolType=" + rolType
				+ ", socialProviderId=" + socialProviderId
				+ ", socialValidatedId=" + socialValidatedId + "]";
	}

}
