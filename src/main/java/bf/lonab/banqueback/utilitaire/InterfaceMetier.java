package bf.lonab.banqueback.utilitaire;

import java.util.List;

public interface InterfaceMetier<T,U> {
	public T creer(T entite);
	public T modifier(T entite);
	public boolean supprimer(U identifiant);
	public List<T> lister();
	public T trouver(U identifiant);
	
}
