package entidade;
 
import java.math.BigInteger;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

import enums.Role;
import enums.Situacao;
 
@Entity
@Table(name = "tb_usuario")
public class Usuario extends EntidadeBasica{
 
	/**
	 * 
	 */
	private static final long serialVersionUID = 7181106172249020200L;

	@Id
	@Column(name = "id_usuario")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "usario", unique = true, nullable = false, length = 45)
	private String usuario;
	
	@Column(name = "senha", nullable = false, length = 60)
	private String senha;
	
	@Column(name="situacao")
	@Enumerated(EnumType.STRING)
	private Situacao situacao;
	
	@ElementCollection(targetClass=Role.class)
    @Enumerated(EnumType.STRING) 
    @CollectionTable(name="tb_usuario_role", joinColumns = @JoinColumn(name = "id_usuario"))
    @Column(name="role", nullable = false) 
	private Set<Role> roles;
	
	public Usuario(){
		roles = new HashSet<Role>(BigInteger.ZERO.intValue());
		situacao = Situacao.ATIVO;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Situacao getSituacao() {
		return situacao;
	}

	public void setSituacao(Situacao situacao) {
		this.situacao = situacao;
	}

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}
}