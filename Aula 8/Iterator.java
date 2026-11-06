import java.utils.Iterator;

public static void Media(HashSet x) {
    int soma = 0;
    Iterator it = x.iterator();
    while(it.hasNext()) {
    	Object o = it.next();
    	String y = (String)o;
    	soma += y.length();
    }
    System.out.println(soma);
    System.out.println(x.size());
}
