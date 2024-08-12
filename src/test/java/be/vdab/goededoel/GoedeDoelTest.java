package be.vdab.goededoel;

import static org.assertj.core.api.Assertions.assertThat;

import be.vdab.goededoel.GoedeDoel;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GoedeDoelTest {
	private static final String NAAM = "CliniClowns";
	private GoedeDoel doel;

	@BeforeEach
	void beforeEach() {
		doel = new GoedeDoel(NAAM);
	}

	@Test
	void getNaam() {
		assertThat(doel.getNaam()).isEqualTo(NAAM);
	}
	@Test
	void eenNieuwDoelHeeftNogGeenOpbrengst(){
		assertThat(doel.getOpbrengst()).isZero();
	}
	@Test
	void doelenMetDezelfdeNaamZijnGelijk(){
		assertThat(doel).isEqualTo(new GoedeDoel(NAAM));
	}
	@Test
	void doelMetVerschillendeNaamZijnVerschillend(){
		assertThat(doel).isNotEqualTo(new GoedeDoel("wwf"));
	}
}
