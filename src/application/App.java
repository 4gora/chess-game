package application;

import java.util.InputMismatchException;
import java.util.Scanner;

import chess.ChessException;
import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

public class App {
    public static void main(String[] args) {

        // Código para roda App 
        // ↧ ↧ ↧
        ///home/agr/Documentos/chess-game/bin
        // ↧ ↧ ↧
        // java --enable-preview -cp . application.App


        Scanner sc = new Scanner(System.in);
    
        ChessMatch chessMatch = new ChessMatch();

        while (true) {

            try {
                UI.clearScreen();

                UI.printMatch(chessMatch);
                System.out.println();   
                System.out.print("Origem: ");
                ChessPosition source = UI.readChessPosition(sc);
                
                boolean[][] possibleMoves = chessMatch.possibleMoves(source);
                UI.clearScreen();
                UI.printBoard(chessMatch.getPieces(), possibleMoves);
                
                System.out.println();                
                System.out.print("Destino: ");
                ChessPosition target = UI.readChessPosition(sc);
                
                ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
            } 
            catch (ChessException e) {
                System.out.println(e.getMessage());
                sc.nextLine();
            }
            catch (InputMismatchException e) {
                System.out.println(e.getMessage());
                sc.nextLine();
            }
        }
        
    }
}
