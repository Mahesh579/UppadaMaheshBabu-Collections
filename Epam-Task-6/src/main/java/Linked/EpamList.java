package Linked;
import java.util.Arrays;
public class EpamList <E> {
int size=0;
private static final int cap=10;
Object element[];
public EpamList()
{
	element =new Object[cap];
}
void enCap()
{
	int nSize=element.length*2;
	element=Arrays.copyOf(element,nSize);
}
public void add(E e)
{
	if(size==element.length)
	{
		enCap();
	}
	element[size++]=e;
}
@SuppressWarnings("unchecked")
public E get(int i) {
    if (i >= size || i < 0) {
        throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
    }
    return (E) element[i];
}
public int size() {
    return size;
}
@SuppressWarnings("unchecked")
public E remove(int i) {
    if (i >= size || i < 0) {
        throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
    }
    Object item = element[i];
    int numElts = element.length - ( i + 1 ) ;
    System.arraycopy( element, i + 1, element, i, numElts ) ;
    size--;
    return (E) item;
}

@Override
public String toString() 
{
     StringBuilder printL = new StringBuilder();
     printL.append('[');
     for(int i = 0; i < size ;i++) {
         printL.append(element[i].toString());
         if(i<size-1){
             printL.append(",");
         }
     }
     printL.append(']');
     return printL.toString();
}
 
}
