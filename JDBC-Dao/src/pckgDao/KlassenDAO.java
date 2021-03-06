package pckgDao;

import java.sql.Connection;
import java.util.List;

import pckgDomain.Klassen;

public interface KlassenDAO 
{
	public abstract int insert(Connection con, Klassen u);

	public abstract int update(Connection con, Klassen u);
	
	public abstract int delete(Connection con, Klassen u);

	public abstract List<Klassen> findAllKlassen(Connection con);
}
