import java.util.*;
class WordThread implements Runnable { String paragraph;
WordThread(String paragraph) { this.paragraph = paragraph;
}
public void run() {
String[] words = paragraph.split(" "); for (String word : words) {
System.out.println("Word: " + word);
try { Thread.sleep(2000); } catch (Exception e) {}
}
}
}
class VowelThread implements Runnable { String paragraph;
VowelThread(String paragraph) { this.paragraph = paragraph;
}


public void run() {
for (char ch : paragraph.toCharArray()) { if ("AEIOUaeiou".indexOf(ch) != -1) {
System.out.println("Vowel: " + ch);
try { Thread.sleep(2000); } catch (Exception e) {}
}
}
}
}


public class Question1 {
public static void main(String[] args) { Scanner sc = new Scanner(System.in); System.out.println("Enter a paragraph:"); String text = sc.nextLine();


 
 
Thread t1 = new Thread(new WordThread(text)); Thread t2 = new Thread(new VowelThread(text));

t1.start(); t2.start();} }
2 . import . java.util.*;
class EvenThread extends Thread { int import [] arr; EvenThread(int[] arr) {
this.arr = arr;
}
public void run() { for (int num : arr) {
if (num % 2 == 0) { System.out.println("Even: " + num);
try { Thread.sleep(2000); } catch (Exception e) {}
}
}
}
}


class OddThread extends Thread { int[] arr;


 
 
OddThread(int[] arr) { this.arr = arr;
}
public void run() { for (int num : arr) {
if (num % 2 != 0) { System.out.println("Odd: " + num);
try { Thread.sleep(2000); } catch (Exception e) {}
}
}
}
}
public class Question2 {
public static void main(String[] args) { Scanner sc = new Scanner(System.in); int[] arr = new int[10]; System.out.println("Enter 10 numbers:"); for (int i = 0; i < 10; i++) {
arr[i] = sc.nextInt();
}
EvenThread t1 = new EvenThread(arr); OddThread t2 = new OddThread(arr); t1.start();
t2.start();

 
 
}
}
}
}
3. import java.util.*;
class TableThread extends Thread { int num;
TableThread(int num) { this.num = num;
}
public void run() {
for (int i = 1; i <= 10; i++) {
System.out.println(num + " x " + i + " = " + (num * i)); try { Thread.sleep(2000); } catch (Exception e) {}
}
}
}
class DivisorThread extends Thread { int num;
DivisorThread(int num) { this.num = num;
}
public void run() {
System.out.println("Divisors of " + num + ":");

 
 
for (int i = 1; i <= num; i++) { if (num % i == 0) {
System.out.println(i);
try { Thread.sleep(2000); } catch (Exception e) {}
}
}
}
}
public class Question3 {
public static void main(String[] args) { Scanner sc = new Scanner(System.in); System.out.println("Enter a number:"); int num = sc.nextInt();
TableThread t1 = new TableThread(num); DivisorThread t2 = new DivisorThread(num); t1.start();
t2.start();
}
}
