package com.dellnaresh.common.remote;

import com.dellnaresh.common.remote.entities.BadmintonHire;
import com.dellnaresh.common.remote.entities.Player;

import java.util.List;

/**
 * Created by nareshm on 9/05/2015.
 */
public interface PlayerService {
    public void createPlayer(Player player) throws Exception;
    public void hireCourt(BadmintonHire badmintonHire) throws Exception;
    public Player getPlayer(String username) throws Exception;
    public List<BadmintonHire> getHiredCourts(int payerId) throws Exception;
}
