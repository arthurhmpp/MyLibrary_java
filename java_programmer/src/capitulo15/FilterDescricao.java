package capitulo15;

import java.util.Comparator;

public class FilterDescricao implements Comparator<Brinquedo>{

	@Override
	public int compare(Brinquedo obj, Brinquedo other) {
		return obj.getDescricao().compareTo(other.getDescricao());
	}

}