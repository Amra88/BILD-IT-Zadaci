package zadaci_20_08_2015;

import java.util.ArrayList;

public class Zadatak_1 {
	/*
	 * (Area of a convex polygon) A polygon is convex if it contains any line
	 * segments that connects two points of the polygon. Write a program that
	 * prompts the user to enter the number of points in a convex polygon, then
	 * enter the points clockwise, and display the area of the polygon.
	 */
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.println("Enter the number of the points: ");
		// korisnik unosi broj tacaka konveksnog mnogougla
		int n = input.nextInt();
		// kreiramo novu ArrayListu u koju cemo spremiti tacke mnogougla
		ArrayList<Double> points = new ArrayList<>();
		// korisnik unosi koordinate tacaka (x i y)
		System.out.println("Enter the coordinates of the points: ");
		for (int i = 0; i < n * 2; i++) {
			// unesene koordinate spremamo u listu
			points.add(input.nextDouble());
		}
		// povrsinu konveksnog mnogougla racunamo po sljedecoj formuli
		// P=1/2*((x1*y2+ x2*y3+...xn*y1) - (y1*x2+y2*x3+...+yn*x1))
		double s1 = 1;
		double s2 = 1;
		double area = 1;
		// racunamo prvu sumu, s1 (x1y2 + x2y3...)
		for (int i = 0; i < points.size(); i += 2) {
			if (i == points.size() - 2) {
				s1 += points.get(i) * points.get(1);
				break;
			} else {
				s1 += points.get(i) * points.get(i + 3);
			}
		}
		// racunamo drugu sumu, s2 (y1x2 + y2x3...)
		for (int j = 1; j < points.size(); j += 2) {
			if (j == points.size() - 1) {
				s2 += points.get(j) * points.get(0);
				break;
			} else {
				s2 += points.get(j) * points.get(j + 1);
			}
		}
		// racunamo i povrsinu mnogougla prema formuli, uzimamo njenu apsolutnu
		// vrijednost
		area = Math.abs((s1 - s2) / 2);
		// ispisujemo rezultat
		System.out.println("\nThe total area is " + area);

	}
}
