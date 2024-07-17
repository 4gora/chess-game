package application;

import chess.ChessMatch;

public class App {
    public static void main(String[] args) {

        // Código para roda App 
        // ↧ ↧ ↧
        ///home/agr/Documentos/chess-game/bin
        // ↧ ↧ ↧
        // java --enable-preview -cp . application.App

        System.out.println();
    
        ChessMatch chessMatch = new ChessMatch();

        UI.printBoard(chessMatch.getPieces());

        System.out.println();
    }
}
