package Repository.Profile.Impl;

import Domain.Profile.Owner;
import Repository.Profile.OwnerRepository;

import java.util.HashSet;
import java.util.Set;

public class OwnerRepositoryImpl implements OwnerRepository {

    private static OwnerRepositoryImpl repository = null;
    private Set<Owner> owners;

    private OwnerRepositoryImpl(){
        this.owners = new HashSet<>();
    }

    public static OwnerRepositoryImpl getRepository(){
        if (repository == null) repository = new OwnerRepositoryImpl();
        return repository;
    }

    private Owner findOwner(String ownerUser)
    {
        return this.owners.stream()
                .filter(Owner -> Owner.getUsername().trim()
                        .equals(Owner)).findAny().orElse(null);
    }

    @Override
    public Set<Owner> getAll() {
        return this.owners;
    }

    @Override
    public Owner create(Owner owner) {
        this.owners.add(owner);
        return owner;
    }

    @Override
    public Owner update(Owner owner) {
        String id = owner.getUsername();

        Owner ownerFind = findOwner(id);

        owners.remove(ownerFind);
        owners.add(owner);

        return null;
    }

    @Override
    public void delete(String s) {
        Owner owner = findOwner(s);
        owners.remove(owner);
    }

    @Override
    public Owner read(String s) {
        Owner owner = findOwner(s);
        return owner == null ? null: owner;
    }

}
