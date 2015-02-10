package com.robrua.orianna.type.dto.staticdata;

import java.awt.Image;
import java.util.List;

import com.robrua.orianna.type.dto.OriannaDto;

public class Champion extends OriannaDto {
    private static final long serialVersionUID = -7433824613178209493L;
    private List<String> allytips, enemytips, tags;
    private String blurb, key, lore, name, partype, title;
    private Integer id;
    private Image image;
    private Info info;
    private Passive passive;
    private List<Recommended> recommended;
    private List<Skin> skins;
    private List<ChampionSpell> spells;

    /*
     * (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(final Object obj) {
        if(this == obj) {
            return true;
        }
        if(obj == null) {
            return false;
        }
        if(!(obj instanceof Champion)) {
            return false;
        }
        final Champion other = (Champion)obj;
        if(id == null) {
            if(other.id != null) {
                return false;
            }
        }
        else if(!id.equals(other.id)) {
            return false;
        }
        return true;
    }

    /**
     * @return the allytips
     */
    public List<String> getAllytips() {
        return allytips;
    }

    /**
     * @return the blurb
     */
    public String getBlurb() {
        return blurb;
    }

    /**
     * @return the enemytips
     */
    public List<String> getEnemytips() {
        return enemytips;
    }

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @return the image
     */
    public Image getImage() {
        return image;
    }

    /**
     * @return the info
     */
    public Info getInfo() {
        return info;
    }

    /**
     * @return the key
     */
    public String getKey() {
        return key;
    }

    /**
     * @return the lore
     */
    public String getLore() {
        return lore;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the partype
     */
    public String getPartype() {
        return partype;
    }

    /**
     * @return the passive
     */
    public Passive getPassive() {
        return passive;
    }

    /**
     * @return the recommended
     */
    public List<Recommended> getRecommended() {
        return recommended;
    }

    /**
     * @return the skins
     */
    public List<Skin> getSkins() {
        return skins;
    }

    /**
     * @return the spells
     */
    public List<ChampionSpell> getSpells() {
        return spells;
    }

    /**
     * @return the tags
     */
    public List<String> getTags() {
        return tags;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (id == null ? 0 : id.hashCode());
        return result;
    }

    /**
     * @param allytips
     *            the allytips to set
     */
    public void setAllytips(final List<String> allytips) {
        this.allytips = allytips;
    }

    /**
     * @param blurb
     *            the blurb to set
     */
    public void setBlurb(final String blurb) {
        this.blurb = blurb;
    }

    /**
     * @param enemytips
     *            the enemytips to set
     */
    public void setEnemytips(final List<String> enemytips) {
        this.enemytips = enemytips;
    }

    /**
     * @param id
     *            the id to set
     */
    public void setId(final Integer id) {
        this.id = id;
    }

    /**
     * @param image
     *            the image to set
     */
    public void setImage(final Image image) {
        this.image = image;
    }

    /**
     * @param info
     *            the info to set
     */
    public void setInfo(final Info info) {
        this.info = info;
    }

    /**
     * @param key
     *            the key to set
     */
    public void setKey(final String key) {
        this.key = key;
    }

    /**
     * @param lore
     *            the lore to set
     */
    public void setLore(final String lore) {
        this.lore = lore;
    }

    /**
     * @param name
     *            the name to set
     */
    public void setName(final String name) {
        this.name = name;
    }

    /**
     * @param partype
     *            the partype to set
     */
    public void setPartype(final String partype) {
        this.partype = partype;
    }

    /**
     * @param passive
     *            the passive to set
     */
    public void setPassive(final Passive passive) {
        this.passive = passive;
    }

    /**
     * @param recommended
     *            the recommended to set
     */
    public void setRecommended(final List<Recommended> recommended) {
        this.recommended = recommended;
    }

    /**
     * @param skins
     *            the skins to set
     */
    public void setSkins(final List<Skin> skins) {
        this.skins = skins;
    }

    /**
     * @param spells
     *            the spells to set
     */
    public void setSpells(final List<ChampionSpell> spells) {
        this.spells = spells;
    }

    /**
     * @param tags
     *            the tags to set
     */
    public void setTags(final List<String> tags) {
        this.tags = tags;
    }

    /**
     * @param title
     *            the title to set
     */
    public void setTitle(final String title) {
        this.title = title;
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Champion [allytips=" + allytips + ", enemytips=" + enemytips + ", tags=" + tags + ", blurb=" + blurb + ", key=" + key + ", lore=" + lore
                + ", name=" + name + ", partype=" + partype + ", title=" + title + ", id=" + id + ", image=" + image + ", info=" + info + ", passive="
                + passive + ", recommended=" + recommended + ", skins=" + skins + ", spells=" + spells + "]";
    }
}
