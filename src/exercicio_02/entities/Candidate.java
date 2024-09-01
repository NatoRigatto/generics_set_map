package exercicio_02.entities;

import java.util.Objects;

public class Candidate {

	private String name;
	private Integer voteQuantity;

	public Candidate(String name, Integer voteQuantity) {
		this.name = name;
		this.voteQuantity = voteQuantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getVoteQuantity() {
		return voteQuantity;
	}

	public void setVoteQuantity(Integer voteQuantity) {
		this.voteQuantity = voteQuantity;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Candidate other = (Candidate) obj;
		return Objects.equals(name, other.name);
	}
}
