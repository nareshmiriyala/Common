package com.dellnaresh.common.remote;

import com.dellnaresh.common.remote.entities.BadimintionHire;
import com.dellnaresh.common.remote.entities.Player;

/**
 * Created by nareshm on 9/05/2015.
 */
public interface PlayerService {
    public void createPlayer(Player player) throws Exception;
    public void hireCourt(BadimintionHire badimintionHire) throws Exception;
    public Player getPlayer(String username) throws Exception;
}
