package Iterable;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.LinkedList;


public class ULibrary implements Iterable<String> {

    private LinkedList<String> urls = new LinkedList<String>();
    private LinkedList<Integer> list = new LinkedList<Integer>();

    private class UrlIterator implements Iterator<String>{


        int index=0;
        @Override
        public boolean hasNext() {
            return index<urls.size();
        }

        @Override
        public String next() {

            StringBuilder sb = new StringBuilder();
            try {
                URL url = new URL(urls.get(index));
                BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));

                while((br.readLine())!=null){

                    sb= sb.append(br.readLine());
                    sb.append("\n");
                }

                br.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
            index++;
            return sb.toString();
        }

        @Override
        public void remove() {
            urls.remove(index);

        }
    };
    public ULibrary() {
        urls.add(<URL name>);
        urls.add(<URL name>);
    }

    @Override
    public Iterator<String> iterator() {
        return new UrlIterator();
    }
}
