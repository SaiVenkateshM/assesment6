package com.example.assesment6.repo;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;
import com.example.assesment6.modal.Artist;

	@Repository
	public class ArtistDALimpl implements ArtistDAL {

		@Autowired
		private MongoTemplate mongo;
		
		public void create(Artist a) {
			mongo.insert(a);
			
		}

		public List<Artist> findAll() {
			
			return mongo.findAll(Artist.class);
		}

		@Override
		public Artist findById(String id) {
		
			Query q = new Query();
			q.addCriteria(Criteria.where("id").is(id));
			return mongo.find(q, Artist.class).get(0);
		}

		@Override
		public void deleteArtist(String artistName) {
			Query q = new Query();
			q.addCriteria(Criteria.where(artistName).is(artistName));
			mongo.findAndRemove(q,Artist.class);
			
		}

	}
}
