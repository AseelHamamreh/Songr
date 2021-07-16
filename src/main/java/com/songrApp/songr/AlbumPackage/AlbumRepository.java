package com.songrApp.songr.AlbumPackage;

import com.songrApp.songr.AlbumPackage.Album;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AlbumRepository extends JpaRepository<Album,Long> {
}
