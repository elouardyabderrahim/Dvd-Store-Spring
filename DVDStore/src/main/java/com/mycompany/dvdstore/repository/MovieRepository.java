package com.mycompany.dvdstore.repository;

/*
@Repository
public class MovieRepository implements MovieRepositoryInterface{

   @Autowired
    private JdbcTemplate jdbcTemplate;


    @Override
    public Movie add(Movie movie) {

        KeyHolder kh=new GeneratedKeyHolder();

        jdbcTemplate.update(connection -> {
            PreparedStatement pstmt=connection.prepareStatement("INSERT INTO MOVIE (TITLE,GENRE,DESCRIPTION) VALUES (?,?,?)", Statement.RETURN_GENERATED_KEYS);
            pstmt.setString(1,movie.getTitle());
            pstmt.setString(2,movie.getGenre());
            pstmt.setString(3,movie.getDescription());
            return pstmt;
        },kh);

        movie.setId(kh.getKey().longValue());

        return movie;
    }

    @Override
    public List<Movie> list() {
        return jdbcTemplate.query("SELECT ID, TITLE, GENRE FROM MOVIE",(rs,rowNum)-> new Movie(rs.getLong("ID"),
                rs.getString("TITLE"),rs.getString("GENRE")));
    }

    @Override
    public Movie getById(long id) {
        return jdbcTemplate.queryForObject("SELECT ID,TITLE,GENRE,DESCRIPTION FROM MOVIE WHERE ID=?",new Object[]{id},
                (rs,rowNum)-> new Movie(rs.getLong("ID"),
                        rs.getString("TITLE"),rs.getString("GENRE"),rs.getString("DESCRIPTION")));
    }
}*/
