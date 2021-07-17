package com.songrApp.songr.AlbumPackage;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlbumTest {

    @Test
    void testAlbumFunctions() {
        Album test = new Album("title", "artist",12,"3 H","https://testURL");
        assertEquals(test.getTitle(),"title");
        assertEquals(test.getArtist(),"artist");
        assertEquals(test.getSongCount(),12);
        assertEquals(test.getLength(),"3 H");
        assertEquals(test.getImageUrl(),"https://testURL");
    }
}