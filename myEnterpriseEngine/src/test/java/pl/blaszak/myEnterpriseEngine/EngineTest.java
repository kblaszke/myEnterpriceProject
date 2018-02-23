package pl.blaszak.myEnterpriseEngine;

import org.junit.Before;
import org.junit.Test;
import pl.blaszak.practise.myEnterpriseProject.domain.Gender;
import pl.blaszak.practise.myEnterpriseProject.domain.ObjectFactory;
import pl.blaszak.practise.myEnterpriseProject.domain.Person;
import pl.blaszak.practise.myEnterpriseProject.domain.ProgramingLanguage;
import pl.blaszak.practise.myEnterpriseProject.domain.Skill;
import pl.blaszak.practise.myEnterpriseProject.domain.SkillArray;
import pl.blaszak.practise.myEnterpriseProject.domain.SkillLevel;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

public class EngineTest {

    private ObjectFactory factory;
    private Engine engine;

    @Before
    public void init() {
        factory = new ObjectFactory();
        engine = new Engine();
    }

    @Test
    public void shouldReturnAllRegisteredPersons() {
        // given
        List<Skill> skills1 = createSkills(createSkill(ProgramingLanguage.JAVA, SkillLevel.GURU), createSkill(ProgramingLanguage.JAVA_EE, SkillLevel.SENIOR));
        Person person1 = createPerson("kblaszke", "Krzysztof", "Blaszke", "kblaszke@outlook.com", Gender.MALE, skills1);
        List<Skill> skills2 = createSkills(createSkill(ProgramingLanguage.RUBY, SkillLevel.SENIOR), createSkill(ProgramingLanguage.PYTHON, SkillLevel.MEDIUM));
        Person person2 = createPerson("kajot", "Katarzyna", "Blaszke", "kajot@onet.pl", Gender.FEMALE, skills2);
        // when
        engine.registerPerson(person1).registerPerson(person2);
        // then
        List<Person> persons = engine.getPersons();
        assertThat(persons).isNotNull().hasSize(2).contains(person1).contains(person2);

    }

    private Skill createSkill(ProgramingLanguage language, SkillLevel level) {
        Skill skill = factory.createSkill();
        skill.setLanguage(language);
        skill.setLevel(level);
        return skill;
    }

    private List<Skill> createSkills(Skill...skills) {
        return Arrays.stream(skills).collect(Collectors.toList());
    }

    private Person createPerson(String login, String fName, String sName, String email, Gender gender, List<Skill> skills) {
        Person person = factory.createPerson();
        person.setLogin(login);
        person.setFirstName(fName);
        person.setSecondName(sName);
        person.setEmail(email);
        person.setGender(gender);
        person.setSkillArray(new SkillArray());
        person.getSkillArray().getSkills().addAll(skills);
        return person;
    }
}