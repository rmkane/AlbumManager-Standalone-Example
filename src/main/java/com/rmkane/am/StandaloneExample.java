package com.rmkane.am;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.rmkane.am.model.dto.AlbumDto;
import com.rmkane.am.model.dto.ArtistDto;
import com.rmkane.am.model.service.AlbumLocal;
import com.rmkane.am.model.service.ArtistLocal;

@Component
public class StandaloneExample {

	@Autowired
	private AlbumLocal albumService;
	@Autowired
	private ArtistLocal artistService;

	public static void main(final String[] args) throws Exception {
		ConfigurableApplicationContext ctx = null;
		StandaloneExample standalone = null;

		try {
			ctx = new ClassPathXmlApplicationContext("spring-config.xml");
			standalone = ctx.getBean(StandaloneExample.class);
			standalone.startStandalone();
		} finally {
			if (ctx != null) {
				ctx.close();
			}
		}
	}

	private void startStandalone() {
		AlbumDto albumDto = createAlbum("Back In Black", "AC/DC", 1980);

		albumService.save(albumDto);

		List<AlbumDto> results = albumService.retrieveAll();

		for (AlbumDto dto : results) {
			System.out.println(dto);
		}
	}
	
	private AlbumDto createAlbum(String title, String artistName, int releaseYear) {
		AlbumDto album = new AlbumDto();
		ArtistDto artist = createArtist(artistName);

		album.setTitle(title);
		album.setReleaseYear(releaseYear);
		artist.setName(artistName);
		album.setArtist(artist);
		
		return album;
	}
	
	private ArtistDto createArtist(String name) {
		ArtistDto artist = new ArtistDto();
		artist.setName(name);
		return artist;
	}
}
