package org.games.stratego.model.gameplay.Pieces;

import org.games.stratego.model.gameplay.Player;

public class Marshal extends Piece{

    private String name = "marshal";
    private boolean canMove = true;
    private int rank = 10;

    public Marshal(Player owner)
    {
        this.owner = owner;
    }
}
