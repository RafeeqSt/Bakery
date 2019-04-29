package Repository.Impl;

import Domain.Profile.Profile;
import Repository.ProfileRepositpry;

import java.util.HashSet;
import java.util.Set;

public class ProfileRepositoryImpl implements ProfileRepositpry {

    private static ProfileRepositoryImpl repository = null;
    private Set<Profile> profiles;

    private ProfileRepositoryImpl(){
        this.profiles = new HashSet<>();
    }

    public static ProfileRepositoryImpl getRepository(){
        if (repository == null) repository = new ProfileRepositoryImpl();
        return repository;
    }

    private Profile findProfile(String accessLevel)
    {
        return this.profiles.stream()
                .filter(Profile -> Profile.getAccessLevel().trim()
                        .equals(Profile)).findAny().orElse(null);
    }

    @Override
    public Set<Profile> getAll() {
        return this.profiles;
    }

    @Override
    public Profile create(Profile profile) {
        this.profiles.add(profile);
        return profile;
    }

    @Override
    public Profile update(Profile profile) {
        String id = profile.getAccessLevel();

        Profile profileFind = findProfile(id);

        profiles.remove(profile);
        profiles.add(profile);

        return null;
    }

    @Override
    public void delete(String s) {
        Profile profile = findProfile(s);
        profiles.remove(profile);
    }

    @Override
    public Profile read(String s) {
        Profile profile = findProfile(s);
        return profile == null ? null: profile;
    }

}
